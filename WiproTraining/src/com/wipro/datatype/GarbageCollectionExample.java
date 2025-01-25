package com.wipro.datatype;

public class GarbageCollectionExample {

    public static void main(String[] args) {
        // Create two objects
        @SuppressWarnings("unused")
		GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        // Assign obj1 to obj2 (obj1 is no longer referenced)
        obj1 = obj2;

        // Explicitly suggest garbage collection
        System.gc();

        System.out.println("End of main method");
    }

    @Override
    protected void finalize() throws Throwable {
        // This method is called by the Garbage Collector
        System.out.println("Garbage collected for object: " + this);
    }
}

