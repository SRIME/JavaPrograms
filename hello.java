class primenumber
{
    public static void main(String args[])
    {
        int a=1, b=10;
        for(int i=a; i<b; i++)
        {
            if(i==2)
                System.out.print("");
            if(i%2!=0)
                System.out.println(" "+i);
        }
    }
}