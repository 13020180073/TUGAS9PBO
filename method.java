class method { 
    void lakukanSesuatu() { 
        int nonFinalVar = 10;
        final int finalVar = 11;
        class B { 
            void aksesLocalVar() { 
               
                System.out.println("nonFinalVar = " + nonFinalVar);
                
                System.out.println("finalVar = " + finalVar);
            } 
        } 
       
        B b = new B();
        b.aksesLocalVar();
    } 
} 
