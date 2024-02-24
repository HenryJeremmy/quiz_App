package com.example.myquizapp

import java.util.ArrayList

object Constants  {

    const val USER_NAME : String = "User_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

     fun getQuestions():ArrayList<Question>{
         val questionsList = ArrayList<Question>()

         val ques1 = Question(
              id = 1, "What country does this flag belong to?",
             R.drawable.ic_bgflag, "Ghana", "Argentina",
             "Nigeria", "Ireland",
             correctAnswer = 3
         )
         questionsList.add(ques1)

         // 2
         val ques2 = Question(
             id = 2, "What country does this flag belong to?",
             R.drawable.ic_bgusa, "Jordan", "Argentina",
             "Nigeria", "USA",
             correctAnswer = 4
         )
         questionsList.add(ques2)

         // 3
         val ques3 = Question(
             id = 3, "What country does this flag belong to?",
             R.drawable.ic_bgargen, "Uk", "Argentina",
             "Kuwait", "Ireland",
             correctAnswer = 2
         )
         questionsList.add(ques3)

         //4
         val ques4 = Question(
             id = 4, "What country does this flag belong to?",
             R.drawable.ic_bgire, "Ghana", "Argentina",
             "Nigeria", "Ireland",
             correctAnswer = 4
         )
         questionsList.add(ques4)

         //5
         val ques5 = Question(
             id = 5, "What country does this flag belong to?",
             R.drawable.ic_bgaustralia, "Australia", "Maldives",
             "Nigeria", "South Korea",
             correctAnswer = 1
         )
         questionsList.add(ques5)

         //6
         val ques6 = Question(
             id = 6, "What country does this flag belong to?",
             R.drawable.ic_bgrwanda, "Nigeria", "Argentina",
             "Rwanda", "Ireland",
             correctAnswer = 3
         )
         questionsList.add(ques6)
         return questionsList
     }
}