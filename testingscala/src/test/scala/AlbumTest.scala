
//import org.scalatest.FunSpec
import org.scalatest._
//import org.scalatest.Matchers.ShouldMatchers

class AlbumTest extends FlatSpec {
//  describe("An Album") {
//    it("can add an Artist object to the album") {
//      val album = new Album("Thriller",1981,
//        new Artist("Michael", "Jackson"))
//    }
//  }
  "An Album" should "add an Artis object to the album" in {
    val album = new Album("Thriller",1981,
      new Artist("Michael Jackson"))
  }
}
