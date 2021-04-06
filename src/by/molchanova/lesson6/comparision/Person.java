package by.molchanova.lesson6.comparision;

public final class Person implements Comparable<Person> /*Comparator<Name>*/{

    private static int count = 0;
	
	private String name;
	private int age;
	private Account account;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.account = new Account();
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

//	@Override
//	public int compareTo(Person anotherPerson) {
//	    if (age == anotherPerson.age) {
//	        return name.compareTo(anotherPerson.name);
//        }
//		return age - anotherPerson.age;
//	}

	@Override
	public int compareTo(Person other) {
		return name.length() - other.name.length();
	}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//	@Override
//	public int compare(Name o1, Name o2) {
//		return o1.name.length() - o2.name.length();
//	}

    protected class Account {

	    private int id;
	    private String login;

	    public Account() {}

	    public Account(String login) {
	        this.login = login;
        }

	    public String getLogin() {
            System.out.println(Person.count);
            System.out.println(this.login);
	        return this.login;
        }
    }

//    public void writeLogin() {
//	    this.account = new Account("login");
//	    this.account.getLogin();
//    }

    public String getAccount() {
        return account.getLogin();
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public static int getCount() {
	    return count;
    }
}
