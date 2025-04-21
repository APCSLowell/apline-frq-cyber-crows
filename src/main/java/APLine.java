public class APLine
{
private int A,B,C 
public APLine(int a, int b, int c)
  A=a; 
  B=b;
  C=c; 
public double getSlope() {
  return ((double) -A)/B; 
}
public boolean isonLine(int x, int y)
  if((A*x)+(b*y)+C==0)
    return true;  
  else 
    return false; 
}
