## 👩‍💻 Author

**Name:** Anjali Masali  
📫 **GitHub:** [@anjalimasali2007](https://github.com/anjalimasali2007)  
✉️ **Email:** [anjalimasali05@gmail.com](mailto:anjalimasali05@gmail.com)


# 💸 Personal Expense Tracker Hibernate

🚀 Features
✅ Add New Expense – Date, amount, category, and description

🔍 View All Expenses – Display expenses in a table format

✏️ Edit Expense – Update date, category, or amount

❌ Delete Expense – Remove an entry by ID



💾 Data Storage – PostgreSQL database 


🛠️ Technologies Used



💻 Core Java	

🧩 JDBC	

🛢️ PostgreSQL	

📁 Maven	

🧰 IntelliJ	IDE


📦 Prerequisites

Java JDK 8+

Apache Maven

PostgreSQL 

IDE:  IntelliJ

JDBC Driver 

Hibernate

JPA




## 📂 Project Structure (Maven)

```plaintext
PersonalExpenseTrackerHibernate/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/tracker/
        │       ├── Main.java
        │       ├── HibernateUtil.java  
        │       ├── model/
        │       │   └── Expense.java
        │       ├── dao/
        │       │   └── ExpenseDAO.java  
        └── resources/
                └── hibernate.cfg.xml
      
          
        
## 🧩 Dependencies (`pom.xml`)

```xml
<dependencies>
  <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <version>42.7.7</version>
  </dependency>
  <dependency>
      <groupId>org.hibernate.orm</groupId>
      <artifactId>hibernate-core</artifactId>
      <version>7.0.5.Final</version>
  </dependency>
</dependencies>
```


## Screenshots

<img width="547" height="616" alt="Screenshot 2025-07-13 223244" src="https://github.com/user-attachments/assets/f5f1da20-9e95-425a-8037-ac39616842f7" />

<img width="384" height="404" alt="Screenshot 2025-07-13 223924" src="https://github.com/user-attachments/assets/15f9bee7-e692-4092-a9a8-3499d9f06bba" />

<img width="379" height="419" alt="Screenshot 2025-07-13 224048" src="https://github.com/user-attachments/assets/53d3f25b-b199-4016-868e-3de49ae0e093" />


