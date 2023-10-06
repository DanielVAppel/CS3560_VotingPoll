// Validates answer submissions
public class AnswerValidator {
    private Question question;
    // Constructor for initializing the AnswerValidator with a specific question
    public AnswerValidator(Question question) {
        this.question = question;
    }
    // Validates if the chosen answer is valid for the given question

    public boolean isValidAnswer(String answer) {
        return question.getCandidateAnswers().contains(answer);
    }
}
