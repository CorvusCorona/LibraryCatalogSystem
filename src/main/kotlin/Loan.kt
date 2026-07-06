import java.time.LocalDate

class Loan(val book: Book, val member: Member, val date: LocalDate){
    /*
    Loan should not be a data class because a
    data class overrides:

    - equals(), which would make the == operator check
    whether the created Loan objects have the same
    constructor property values, not whether they
    point to the same object. In a library, if the
    same member borrows the same book on two separate,
    distinct calendar days, because Loan objects are
    from a regular class, checking whether loan1 == loan2
    returns false, which means the loan objects are
    distinct records for the same member. If they
    were data class objects, the check would return true.

    - copy(), which copies the underlying object,
    but - in this exercise at least - with a modified
    constructor parameter. If you copy a loan data class
    object, you'll have two or more loan objects. In the
    DB world, that violates ACID.
     */
}