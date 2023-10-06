import java.util.List;
//Manages the creation of questions
public class QuestionManager {
	 // Creates a question with specified attributes
    public Question createQuestion(String questionText, List<String> candidateAnswers, boolean isSingleChoice) {
        return new Question(questionText, candidateAnswers, isSingleChoice);
    }
}
