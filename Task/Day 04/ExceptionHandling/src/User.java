
public class User {
    private String name;
    private int age;
    private String nationality;
    private String contact;
    public static int successCount;

    public void setName(String name) {
        try {
            String regex = "^[a-zA-z\\s]+";
            boolean matchName = name.matches(regex);
            if (!matchName) {
                throw new LogInValidationException("Invalid userName.");
            } else {
                this.name = name;
                successCount++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }


    private boolean isAgeValid(int age) {
        return age >= 22 && age <= 45;
    }

    public void setAge(String inputAge) {
        try {
            int parsedAge = Integer.parseInt(inputAge);

            if (isAgeValid(parsedAge)) {
                this.age = parsedAge;
                successCount++;
            } else {
                throw new LogInValidationException("Age must be between 22 and 45");
            }
        } catch (LogInValidationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        }
    }

    public void setNationality(String nationality) {

        try {
            boolean isNationality = nationality.equalsIgnoreCase("Bangladesh");
            if (!isNationality) {
                throw new LogInValidationException("Nationality is invalid.");
            } else {
                this.nationality = nationality;
                successCount++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void setContact(String contact) {
        try {
            String regex = "^[0-9]+";
            boolean isValidContact = contact.matches(regex);
            if ((contact.length() != 11) || (!isValidContact)) {
                throw new LogInValidationException("Contact Number is not valid.");
            } else {
                this.contact = contact;
                successCount++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void result() {
        if (successCount == 4) {
            System.out.println("Congratulations, You logged in Success.");
        } else {
            System.out.println("can not log in, please input all information correctly.");
        }
    }


}
