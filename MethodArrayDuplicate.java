class MethodArrayDuplicate
  {
   public void duplicate(int a[])
    {
      int i;
      boolean v[]=new boolean[a.length];
      int n=a.length;
      for( i=0;i<n;i++)
      {
      v[i]=false;
      }
    
     for(i=0;i<n;i++)
       {
         if(v[i]==true)
           continue;
       
       
       int count=1;
    for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        {
          v[j]=true;
        count++;
          
        }
      }
         if(count!=1)
          System.out.println("Duplicate elements:"+a[i]);
       }
    }
    public static void main(String args[])
    {
      int a[]={1,2,3,4,3,6};
      
      MethodArrayDuplicate obj=new MethodArrayDuplicate();
      obj.duplicate(a);
  }
  }