import java.time.LocalDate

fun main() {
    val book1: Book = Book( "978-0-451-52793-8",
                            "How to Think Like a Computer Scientist",
                            "Allen B. Downey",
                            4);
    val book2: Book = Book( "978-0-451-52793-8",
                            "How to Think Like a Computer Scientist",
                            "Allen B. Downey",
                            8);
    val book4: Book = Book( "978-0-451-52793-8",
                            "Moby Dick",
                            "Ernest Hemingway",
                            2)
    println()
    println(book1.toString())
    println(book2.toString())

    println()
    println(book1 == book2)
    /*
    book1 and book2 are not equal because a data class'
    equals() function checks for ALL constructor properties
    to determine equality (or equivalence). Two book objects
    may have the same ISBN and author (which makes the books
    essentially the same), but since different copiesAvailable
    values are there, the overridden == data class operator
    determines the books are different.
     */

    // Fixed to be a dynamic value.
    val book3 = book1.copy(copiesAvailable = book1.copiesAvailable + 3)
    println()
    println(book1)
    println(book3)

    println()
    val (isbn, title, author, copiesAvailable) = book1
    println(title)
    println(author)

    println()
    val member1: Member = Member("MichaelReyes1", "Michael Reyes")
    /*
    Added a date property for Loan that illustrates that the == operator still
    returns false because the reference equality is used when the object/s are
    created using regular class instead of a data class.
     */
    val loan1: Loan = Loan(book4, member1, LocalDate.parse("2026-07-01"))
    val loan2: Loan = Loan(book4, member1, LocalDate.parse("2026-07-06"))
    println(loan1 == loan2)
}