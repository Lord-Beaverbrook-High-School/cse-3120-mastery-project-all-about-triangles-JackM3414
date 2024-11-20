public class Triangle {
    // Three private variables set to private and zero, so that the methods can change their values, and not be manipulated by the user.
    private double a;
    private double b;
    private double c;
    //Method triangle takes three variables from the task class, and uses if statements, along with "and" statements in order to determine the order of which the three variables should take in order to be accurate
    public Triangle(double s1, double s2, double s3)
    {
        if (s1>s2 && s1>s3 && s2>s3)
        {
            c=s1;
            b=s2;
            a=s3;
        }
        else if(s1>s2 && s1>s3 && s2<s3)
        {
            c=s1;
            b=s3;
            a=s2;
        }
        else if (s1<s2 && s1>s3 && s2>s3)
        {
            c=s2;
            b=s1;
            a=s3;
        }
        else if(s1<s2 && s1<s3 && s2>s3)
        {
            c=s2;
            b=s3;
            a=s1;
        }
        else if(s1<s2 && s1<s3 && s2<s3)
        {
            c=s3;
            b=s2;
            a=s1;
        }
        else if (s1<s2 && s1==s3)
        {
            c=s2;
            b=s3;
            a=s1;
        }
        else if (s1>s2 && s2==s3)
        {
            c=s1;
            b=s2;
            a=s3;
        }
        else if(s1==s2 && s2<s3)
        {
            c=s3;
            b=s2;
            a=s1;
        }
        else if(s1==s2 && s2>s3)
        {
            c=s2;
            b=s1;
            a=s3;
        }
        else
        {
            c=s3;
            b=s1;
            a=s2;
        }
    }
    // Method Triangle that takes no varaibles automatically assigns the triangle as a 3 4 5 triangle
    public Triangle()
    {
        a=3;
        b=4;
        c=5;
    }
    // accessors that return the smallest, medium, and largest side lengths
    public double getSmall()
    {
        return a;
    }
    public double getMed()
    {
        return b;
    }
    public double getLarge()
    {
        return c;
    }
    //mutators that change the value of each side length
    public void setSmall(double num)
    {
        a=num;
    }
    public void setMed(double num)
    {
        b=num;
    }
    public void setLarge(double num)
    {
        c=num;
    }
    // Method displayTriangle returns a string that orders the three varaibles from largest side length to smallest
    public String displayTriangle()
    {
            return ("greatest= "+c+", medium= "+b+"smallest= "+a);
    }
    // Method isRightTri determines if the three side lengths determined in the triangle method is a right triangle by squaring the numbers and seeing if it alligns with pythagorean theorem within a range of 0.1. If the difference between a and b squared to c squared is less than 0.1, it returns as true, if not, it returns it as false, and returns a boolean
    public boolean isRightTri()
    {
        double a2=a*a;
        double b2=b*b;
        double c2=c*c;
        if(a2+b2==c2)
        {
            return true;
        }
        else if(c2-(a2+b2)<=0.1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Method isTri determines whether the side lengths given is a triangle or not, if a plus b is not larger than c, then it returns as false. Returns a boolean
    public boolean isTri()
    {
        if(a+b>c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Method perimeter returns a double that is the sum of all the side lengths
    public double perimeter()
    {
        return a+b+c;
    }
    //Method getArea returns a double that is the value determined through Heron's formula
    public double getArea()
    {
        double p=perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
