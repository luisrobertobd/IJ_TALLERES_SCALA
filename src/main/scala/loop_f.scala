object PagePrinter extends App {

  /*
   * Prints pages page 1 to lastIndex for doc
   */
  def printPages(doc: Document, lastIndex: Int) = ??? //Yet to be defined

  /*
   * Prints pages page startIndex to lastIndex for doc
   */
  def printPages(doc: Document, startIndex: Int, lastIndex: Int) = ???

  /*
   * Prints pages with given Indexes for doc
   */
  def printPages(doc: Document, indexes: Int*) = ???

  /*
   * Prints pages
   */
  private def print(index: Int) = println(s"Printing Page $index.")

}


/*
 * Declares a Document type with two arguments numOfPages, typeOfDoc
 */
case class Document(numOfPages: Int, typeOfDoc: String)


object PagePrinter_imp extends App{

  /*
   * Prints pages page 1 to lastIndex for doc
   */
  def printPages(doc: Document, lastIndex: Int) = if(lastIndex <= doc.numOfPages) for(i <- 1 to lastIndex) print(i)

  /*
   * Prints pages page startIndex to lastIndex for doc
   */
  def printPages(doc: Document, startIndex: Int, lastIndex: Int) =
    if(lastIndex <= doc.numOfPages && startIndex > 0 && startIndex < lastIndex)
      for(i <- startIndex to lastIndex) print(i)

  /*
   * Prints pages with given Indexes for doc
   */
  def printPages(doc: Document, indexes: Int*) =
    for(index <- indexes if index <= doc.numOfPages && index > -1)
      print(index)


  /*
   *  Prints pages
   */
  private def print(index: Int) = println(s"Printing Page $index.")

  println("---------Method V1-----------")
  printPages(Document(15, "DOCX"), 5)

  println("---------Method V2-----------")
  printPages(Document(15, "DOCX"), 2, 5)

  println("---------Method V3-----------")
  printPages(Document(15, "DOCX"), 2, 5, 7, 15,0 , 17)

}


