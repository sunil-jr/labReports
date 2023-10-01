package labsheet1.q2;

public class DVD extends Item implements Borrowable {
    private boolean isCheckedOut;

    public DVD(String title) {
        super(title);
        this.isCheckedOut = false;
    }

    @Override
    public void checkOUt() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("DVD " + getTitle() + " with id: " + getItemId() + " has been checked out");
        } else {
            System.out.println("DVD " + getTitle() + " with id: " + getItemId() + " is already checked out");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckedOut) {
            System.out.println("DVD " + getTitle() + " with id: " + getItemId() + " has been returned");
        } else {
            System.out.println("DVD " + getTitle() + " with id: " + getItemId() + " is not checked out");
        }
    }

}
