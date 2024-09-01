import java.util.Scanner;

public class Question {
    Templet[] questions=new Templet[5];
    String Selection[]=new String[5];
    public Question(){

        questions[0] = new Templet(1, "What is the largest planet in our solar system?", "Earth", "Saturn", "Jupiter", "Uranus", "Jupiter");
        questions[1] = new Templet(2, "Which of the following elements is the lightest?", "Hydrogen", "Helium", "Oxygen", "Nitrogen",  "Hydrogen");
        questions[2] = new Templet(3, "Which of the following ancient civilizations built the Great Pyramid of Giza?", "Greeks", "Romans", "Egyptians", "Chinese",  "Egyptians");
        questions[3] = new Templet(4, "What is the smallest country in the world, both in terms of population and land area?", "Monaco", "Vatican City", "Nauru", "Tuvalu",  "Vatican City");
        questions[4] = new Templet(6, "Who is the founder of the popular social media platform Facebook?",  "Steve Jobs", "Bill Gates", "Mark Zuckerberg","Larry Page",  "Mark Zuckerberg");

    }
    public void playQuiz(){
        int i=0;
        for(Templet q:questions){
        System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            Selection[i]=sc.nextLine();
            i++;
        }
        for(String s:Selection){
            System.out.println(s);
        }


    }
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Templet que=questions[i];
            String answer=que.getAnswer();
            String userAnswer=Selection[i];

            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your Score is : "+score);
    }

}
