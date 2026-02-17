class BookManagement( val title: String, val author: String, var price: Int) {

    fun applyDiscount(percent : Int){
        val discountedprice = price - (price*percent/100)
        price = discountedprice
        println("Discounted price: $price")
    }

    fun getInfo() {
        println("Title: $title\nAuthor: $author\nPrice: $price")
    }
}

fun main(){
    val book1 = BookManagement("Harry Potter", "J.K Rowling", 100)

    book1.getInfo()
    book1.applyDiscount(10)
}