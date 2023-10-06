
import java.util.*;

//Manages the polling process and keeps track of answer statistics
public class VotingService {
    private Question question;// The question being polled
    private Map<String, Integer> singleChoiceCounts; // Keeps track of answer counts for single-choice questions
    private Map<String, Integer> multipleChoiceCounts; // Keeps track of answer counts for multiple-choice question
    private Map<String, Boolean> answerResults; // Keeps track of answer correctness

    //private String correctAnswer; // The correct answer for the question
    private String correctAnswerSingleChoice; // Correct answer for single-choice questions
    private Set<String> correctAnswersMultipleChoice; // Correct answers for multiple-choice questions

    // Constructor for creating a voting service with a specific question
    public VotingService(Question question, String correctAnswer) {
        this.question = question;
        this.singleChoiceCounts = new HashMap<>();
        this.multipleChoiceCounts = new HashMap<>();
        this.answerResults = new HashMap<>();
        

        if (question.isSingleChoice()) {
            this.correctAnswerSingleChoice = correctAnswer;
        } else {
            // Split the correctAnswer string into individual correct choices
            this.correctAnswersMultipleChoice = new HashSet<>(Arrays.asList(correctAnswer.split(" ")));
        }
        
        for (String answer : question.getCandidateAnswers()) {
            singleChoiceCounts.put(answer, 0);
            multipleChoiceCounts.put(answer, 0);}
    }

	public Question getQuestion() {
        return question;
    }
 // Checks if an answer is valid for the current question
    public boolean isValidAnswer(AnswerSubmission submission) {
        String chosenAnswer = submission.getChosenAnswer();
        return question.getCandidateAnswers().contains(chosenAnswer);
    }
    private boolean isAnswerCorrect(String chosenAnswer) {
        if (question.isSingleChoice()) {
            return chosenAnswer.equals(correctAnswerSingleChoice);
        } else {
            return correctAnswersMultipleChoice.contains(chosenAnswer);
        }
    }
 // Submits an answer and updates answer counts
    public void submitAnswer(AnswerSubmission submission) {
        String studentId = submission.getStudentId();
        String chosenAnswer = submission.getChosenAnswer();

        if (!isValidAnswer(submission)) {
            System.out.println("Invalid answer choice for " + studentId + ": " + chosenAnswer);
            return;
        }

        if (question.isSingleChoice()) {
            singleChoiceCounts.put(chosenAnswer, singleChoiceCounts.get(chosenAnswer) + 1);
        } else {
            multipleChoiceCounts.put(chosenAnswer, multipleChoiceCounts.get(chosenAnswer) + 1);
        }
       
        // Check answer correctness and update answer results
        boolean isCorrect = isAnswerCorrect(chosenAnswer);
        //boolean isCorrect = chosenAnswer.equals(correctAnswer);
        answerResults.put(studentId, isCorrect);
    }
    
    
 // Displays the poll results for single-choice questions
    public void displaySingleChoiceResults() {
        System.out.println("Single Choice Question Results:");
        displayResults(singleChoiceCounts);
    }
 // Displays the poll results for multiple-choice questions
    public void displayMultipleChoiceResults() {
        System.out.println("\nMultiple Choice Question Results:");
        displayResults(multipleChoiceCounts);
    }
    // Displays the poll results along with correct and incorrect counts
    public void displayResults(Map<String, Integer> answerCounts) {
        for (String answer : question.getCandidateAnswers()) {
            System.out.println(answer + " : " + answerCounts.get(answer));
        }
    }}

