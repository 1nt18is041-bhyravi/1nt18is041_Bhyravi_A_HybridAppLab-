import 'package:flutter/material.dart';
import 'package:quiz/questions.dart';

void main() {
  runApp(MaterialApp(
    home: SafeArea(
      child: Scaffold(
        appBar: AppBar(
          title: const Text("My Quiz Application"),
        ),
        body: QuizPage(),
      ),
    ),
  ));
}

class QuizPage extends StatefulWidget {
  const QuizPage({Key? key}) : super(key: key);

  @override
  _QuizPageState createState() => _QuizPageState();
}

class _QuizPageState extends State<QuizPage> {
  int questionNumber = 0; // stores the questionNumber, default = first
  int currentScore = 0; // final score initialized to 0
  Questions questions = Questions(); // Create an object of the Question Class

  void updateQuestionNumber() {
    setState(() {
      questionNumber = questionNumber + 1; // Increments the Question Number
      print('$questionNumber');
    });
  }

  void udpateCurrentScore(bool choice, int question_number) {
// based on the choice (T/F button) score will be updated
    if (questions.questionBank.length == question_number) {
      print("End of questions");
    } else {
// checks the current user input against the list answer, if true increments the count
      if (questions.questionBank[question_number].answer == choice) {
        setState(() {
          currentScore++;
        });
      }
    }
  }

  // function to ensure that the question number to be not crossing the boundary of the list
  bool checkquestionNumber(int questionNumber) {
    return questionNumber < questions.questionBank.length ? true : false;
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      child: Column(children: [
        Center(
          child: Text(
            checkquestionNumber(questionNumber)
                ? questions.questionBank[questionNumber].questionText.toString()
                : "End",
            style: TextStyle(fontSize: 40.0),
          ),
        ),
        const SizedBox(height: 20.0),
        if (checkquestionNumber(questionNumber))
          ElevatedButton(
            onPressed: () {
              setState(() {
                if (questionNumber == questions.questionBank.length) {
                  // check the bound of the list
                  print("End of questions");
                } else {
// check the user answer against the answer in the list
                  udpateCurrentScore(true, questionNumber);
// increment the Question Number
                  updateQuestionNumber();
                }
              });
            },
            child: Text('True'),
          ),
        const SizedBox(width: 20.0),
        if (checkquestionNumber(questionNumber))
          ElevatedButton(
            onPressed: () {
              setState(() {
                if (questionNumber == questions.questionBank.length) { // check the bound of the list
                  print("End of questions");
                } else {
// check the user answer against the answer in the list
                  udpateCurrentScore(false, questionNumber);
// increment the Question Number
                  updateQuestionNumber();
                }
              });
            },
            child: Text('false'),
          ),
        const SizedBox(
          height: 100.0,
        ),
        const SizedBox(
          height: 50.0,
        ),
        const Padding(
          padding: EdgeInsets.all(30.0),
          child: Center(
            child: Text(
              "Current Score is:",
              style: TextStyle(fontSize: 30),
            ),
          ),
        ),
        Padding(
          padding: const EdgeInsets.all(30.0),
          child: Center(
            child: Text(
              '$currentScore',
              style: const TextStyle(fontSize: 30),
            ),
          ),
        ),
      ]),
    );
  }
}
