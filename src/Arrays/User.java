package Arrays;

public class User  implements Comparable<User>  {

		public long id;
		public String firstName;
		public String lastName;
		
		public User(long id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}

		@Override
		public int compareTo(User user) {
		    if(user == null )
		        return -1;
		    else
		        return (int)(this.id - user.id);	      
		}			
}
