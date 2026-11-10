public class Assignment01Q05 {
    public static boolean check_if_one_exist(int[] arr)
    {
        for (int i=0;i<arr.length; i++)
        {
            if (arr[i] == 1)
            {
                return true;
            }
        }
            return false;

        

    }
    public static int findShortestPath(int[][] m, int i, int j)
     {
        if (i==j)
        {
            return 0;
        }
       int[] options = new int[m.length];
       int path_len = 2;
       for (int k=0; k<options.length; k++)
       {
        options[k] = 0;
       }
       options[i] = -1;

       for (int k=0; k<m.length; k++)
       {
        if (m[i][k] == 1)
            {
                if (k == j)
                    {
                        return 1;
                    }
             options[k] = 1;
            }
    }
        while (check_if_one_exist(options) == true)
        {
            for (int k=0; k< options.length; k++)
            {
                if (options[k] ==1)
                {
                for (int q=0; q<options.length; q++)
                {
                    if (m[k][q] == 1)
                    {
                    
                    if (q==j)
                    {
                        return path_len;
                    }
                    if (options[q] == 0)
                    {
                        options[q] = 2;
                    }
                    
                }
            }
            }

        }
        for (int k=0; k< options.length; k++)
        {
            if (options[k] == 1)
            {
                options[k] = -1;
            }
            if (options[k] == 2)
            {
                options[k] =1;
            }
        }
        path_len += 1;

    }
    return -1;



    

}
    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}