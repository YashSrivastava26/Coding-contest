import java.util.Scanner;

// class Split_and_Maximize
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner s = new Scanner(System.in);
//         int t = s.nextInt();
//         while(t-- != 0){
//             int nodes = s.nextInt();
//             int sorce = s.nextInt();
//             int sink = s.nextInt();
//             int diff;
//             long ans = 0;
//             if(sorce + sink > nodes){
//                 diff = sorce + sink - nodes;
//                 nodes -= diff;
//                 sorce -= diff;
//                 sink -= diff;
//             }
//             else if(sorce + sink < nodes){
//                 int freeNodes = nodes - sorce - sink;
//                 ans += (freeNodes * (freeNodes - 1) / 2) + freeNodes * sink; 
//             }
//             ans += (sorce * (nodes - sorce));
//             System.out.println(ans);
            
//         }
// 	}
// } 

class MaxEdges
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            long nodes = s.nextInt();
            long sorce = s.nextInt();
            long sink = s.nextInt();
            long ans = 0;
            long freeNodes = nodes - (sorce + sink);
            if(freeNodes < 0){
                nodes += freeNodes;
                sorce += freeNodes;
                sink += freeNodes;
            }
            ans = sorce * sink; 
            if(freeNodes >= 0){
                ans += freeNodes * sink; 
                ans += freeNodes * (freeNodes - 1) / 2; 
                ans += sorce * freeNodes; 
            }
            System.out.println(ans);
        }
	}
}