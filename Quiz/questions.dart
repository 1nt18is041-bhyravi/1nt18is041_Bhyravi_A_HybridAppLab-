import 'package:quiz/question.dart'; // add the question class
class Questions {
  List<Question> questionBank = [ // create a list of Questions using defaul constructor of Question()
    Question(questionText: "Question1", answer: true), // set the Question and Answer
    Question(questionText: "Question2", answer: true),
    Question(questionText: "Question3", answer: false),
    Question(questionText: "Question4", answer: true),
    Question(questionText: "Question5", answer: false),
    Question(questionText: "Question6", answer: false),
    Question(questionText: "Question7", answer: false),
  ];
}