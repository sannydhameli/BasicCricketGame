import java.util.Scanner;

class Team
{
    int TotalRuns;
    int Wickets;
    int Overs;

    Team()
    {
        TotalRuns = 0;
        Wickets = 0;
        Overs = 20;
    }



    public int RandomGenrator()
    {
        return (int)(Math.random()*8);
    }
    public int Play()
    {
        for(int i=0;i<Overs;i++)
        {
            for(int j=0;i<6;j++)
            {
                int x = RandomGenrator();

                if(x==7)
                {
                    Wickets++;
                }
                else
                {
                    TotalRuns = TotalRuns + x;
                }

                if(Wickets == 10)
                {
                    return TotalRuns;
                }
            }
        }

        return TotalRuns;
    }
}
class Match_Controller
{
    public int Toss()
    {
        return (int)Math.random();
    }
    void Go()
    {
        Team T1 = new Team();
        Team T2 = new Team();

        if(Toss()==1)
        {
            T1.Play();
            T2.Play();
        }
        else
        {
           T2.Play();
           T1.Play();
        }

        System.out.println("T1's RUNS : " + T1.TotalRuns + "/" + T1.Wickets);
        System.out.println("T2's RUNS: " + T2.TotalRuns + "/" + T2.Wickets);

        if(T1.TotalRuns == T2.TotalRuns)
        {
            System.out.println("DREW Match");
        }
        else if(T1.TotalRuns > T2.TotalRuns)
        {
            System.out.println("T1 Win The Match");

        }
        else {

            System.out.println("T2 Win The Match");
        }


    }
}

public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("WelCome! please Enter How many Matches Do You Want ? : ");
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {


            Match_Controller Contol = new Match_Controller();
            Contol.Go();
            System.out.println();
        }
    }
}