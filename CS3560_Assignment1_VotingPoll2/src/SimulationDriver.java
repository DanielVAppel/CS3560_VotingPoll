/*CS3560 Assignment 1: VotingPoll 
 * Created By: Daniel Appel
 * Date Created: 10/5/2023
 * Professor: Yu Sun
 * */

import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {
        // Create a question for single choice
        Question singleChoiceQuestion = new Question("What is 2 + 2?", List.of("A. 3", "B. 4", "C. 5"), true);
        String singleChoiceCorrectAnswer = "B. 4";

        // Create a question for multiple choice
        Question multipleChoiceQuestion = new Question("Which colors are in the rainbow?",
                List.of("A. Red", "B. Blue", "C. Green", "D. Yellow", "E. Purple"), false);
        String multipleChoiceCorrectAnswer = "A B C D"; // Separate correct choices with spaces
        
        // Create a VotingService for single choice and multiple choice questions
        VotingService singleChoiceVotingService = new VotingService(singleChoiceQuestion, singleChoiceCorrectAnswer);
        VotingService multipleChoiceVotingService = new VotingService(multipleChoiceQuestion, multipleChoiceCorrectAnswer);
        
        // Simulate student submissions for single choice
        simulateSubmissions(singleChoiceVotingService, 20);

        // Simulate student submissions for multiple choice
        simulateSubmissions(multipleChoiceVotingService, 20);

        // Display results for single choice
        singleChoiceVotingService.displaySingleChoiceResults();

        // Display results for multiple choice
        multipleChoiceVotingService.displayMultipleChoiceResults();
    }

    // Simulate student submissions
    private static void simulateSubmissions(VotingService votingService, int numStudents) {
        Random random = new Random();

        for (int i = 1; i <= numStudents; i++) {
            String studentId = "Student" + i;
            String randomAnswer = getRandomAnswer(votingService.getQuestion().getCandidateAnswers(), random);
            AnswerSubmission submission = new AnswerSubmission(studentId, randomAnswer);
            votingService.submitAnswer(submission);
        }
    }

    // Get a random answer from the list of candidate answers
    private static String getRandomAnswer(List<String> candidateAnswers, Random random) {
        int randomIndex = random.nextInt(candidateAnswers.size());
        return candidateAnswers.get(randomIndex);
    }
}

