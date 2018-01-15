public class Table {
    int tab[] = new int[10];
    int indiceTqTabNul(int size){
        int i;
        if (size > 0)
            for (i=1; i<=size; i++)
                if (tab[i] = 0)
                    return i;
        else
                    System.out.println("Table is empty");
                    System.err.println("Error");
        return -1;
    }
}
