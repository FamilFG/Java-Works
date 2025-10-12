package ExceptionHandling;

public class Library {
    String[] listOfBooks = {"Great China", "Last Of Us", "RDR2", "Minecraft"};
    public void findBook(String title) throws BookNotFoundException {
    boolean isFound = false;
        for (String book : listOfBooks) {
            if (book.equalsIgnoreCase(title)) {
                System.out.println(title + " is found");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new BookNotFoundException("Book " + title + " not found");
        }
    }
}
