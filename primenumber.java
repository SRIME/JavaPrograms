class primenumber
{
    public static void main(String args[])
    {
        int a=1, b=20;
        for(int i=a; i<b; i++)
        {   
            if(i==1)
                System.out.print("");
            if(i%2!=0 && i%3!=0 || i==3 || i==2)
                System.out.println(" "+i);
        }
    }
}