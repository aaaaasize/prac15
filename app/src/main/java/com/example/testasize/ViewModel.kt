import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    var currentQuestionIndex = 0
    var correctAnswers = 0
    var incorrectAnswers = 0
    var answeredQuestions = Array<Boolean>(15) { false }
}