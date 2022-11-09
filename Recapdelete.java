class Recapdelete
{
  public void delete(int a[],int ele)
  {
    for(int i=0;i<a.length;i++)
      {
        if(a[i]==ele)
        {
          continue;
        }
        System.out.print(a[i]+" ");
      }
  }
  public static void main(String args[])
  {
    int a[]={1,2,3,4,5,6};
    int ele=6;
    Recapdelete obj=new Recapdelete();
    obj.delete(a,ele);
  }
}