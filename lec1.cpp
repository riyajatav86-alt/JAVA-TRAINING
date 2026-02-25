1 how to resolve the AMBIGUTY that accurs in hybrid inheritance

 whenever a class inheritice from two or more than two classes it gets the behaviour of all those classes ,also it get the behaviour of the parents of its parents classes.
 due to this, this child class may have multiple copies of the attributes and the behaviour
 of its grand parent class.by accesing these copies c++ gets confused as to which copy from which parent is being called 

 this issue can be solved using anyone of the following methods
 
 1. clarrifying the copy using scope:: resolution operator in front of the variable and the method name.

 2. in herichal inheritance the two or more classs which are inheriting from a single base class should inherit vertually . this results to create a single copy in the class that inherits from multiple classes.


 Class A{
    private:
    int A;
    protected:
    int y;
    public:
    int z;
    class B: public A{
        //x=not accesible
        //y=accesible
        //z=accesible
    };
    class C: protected A{
        //x=not accesible
        //y=protected
        //z=protected
        
    };
    Class D: private A{
        //x=not accesible
        //y=private
        //z=private
    };
           

                                 [A]
                                 /   \ 
                {PUBLIC}   [B] [C]{PROTECTED}  [D]{PRIVATE}
                B={B1..Y,Z}  C={C1 Y,Z}      D={D1  NOTHING}


                