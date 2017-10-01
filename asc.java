import java.io.*;
class Example
{
int a[],n,c;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter n");
n=Integer.parseInt(br.readLine());
a=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter"+(i+1)+"elements");
a[i]=Integer.parseInt(br.readLine());
}
}
void process()
{
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
c=a[i];
a[i]=a[j];
a[j]=c;
}
}
}
}
void output()
{
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}
class AMain
{
public static void main(String arg[])throws IOException
{
Exam e=new Exam();
e.input();
e.process();
e.output();
}
}