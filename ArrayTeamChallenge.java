import java.util.Scanner;

public class ArrayTeamChallenge {

    public static void main(String[] args) {

        int[] scores = {78, 92, 85, 67, 95, 88, 73, 90};

        // Challenge 1:
        // Display every score in the array using a loop.
        for(int i=0; i < scores.length; i++){
            System.out.print(scores[i]+ " ");
        }
        System.out.println();
        
        // Challenge 2:
        // Calculate and display the average score.
        // Your solution should still work if more scores are added.
        double sum=0;
        double avg=0;
        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        
        avg=sum/scores.length;
        System.out.println("Average score: " + avg);
        
        // Challenge 3:
        // Find and display the highest and lowest score in the array.
        // Do not simply print 95.
        int highest=scores[0], lowest=scores[0];
        for(int i=0;i<scores.length;i++){
            if(scores[i] > highest){
                highest = scores[i];;
            }
            if(scores[i] < lowest){
                lowest = scores[i];
            }

        }
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
        // Challenge 4:
        // Count and display how many scores are above the average.
        double average=0;
        int cnt=0;
        for (int q=0; q<scores.length; q++){
            average += scores[q];
        }
        average = average/scores.length;
        for (int x=0; x<scores.length; x++){
            if (scores[x] > average){
                cnt++;
            }
        }
        System.out.println("The amount of scores above the average is " + cnt);

        // BONUS 1 - REVERSE ORDER:
        // Display the scores in reverse order.
        for(int i=1; i < (scores.length + 1); i++)
        {
            System.out.print(scores[scores.length - i] + " ");
        }
        System.out.println();

        // BONUS 2 - SCORE SEARCH:
        // Ask the user to enter a score to search for.
        // Determine whether the score exists in the array.
        // Display the index of the first occurrence.
        // Count how many times the score appears.
        // If it is not found, display an appropriate message.
        Scanner newScanner=new Scanner(System.in);
        System.out.print("Enter a score to search for: ");
        int searchScore=newScanner.nextInt();
        
        int foundIndex=-1;
        int count=0;
        for(int c=0;c<scores.length;c++){
            if(scores[c]==searchScore && foundIndex==-1){
                foundIndex=c;
                count++;
            }else if(scores[c]==searchScore){
                count++;
            }
        }
        
        if(foundIndex>=0){
            System.out.print("Score found at index: " + foundIndex + "\nFound "+ count +" of them.");
        }else{
            System.out.print("Score not found.");
        }
        
        newScanner.close();
    }
}