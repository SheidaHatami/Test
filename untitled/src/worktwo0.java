//tarahi barname baraye ketabkhane
//Sheida Hatami

import com.BookLibrary;

public class worktwo0 {

    public static void main(String[] args) {
        BookLibrary number1 = new BookLibrary();
        System.out.print("Enter name of the book that you need:");
        System.out.println();
        number1.borrow();

        number1.refund();

        number1.donate();

    }
}
