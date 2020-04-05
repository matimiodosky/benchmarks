import scala.math 

object Hello extends App {
    val start = System.currentTimeMillis()
    Future {
	    for(i <- 0 to 55000000){
	    	val a = 1000 * 1000
	    }
	}.onComplete(_ => println(println(System.currentTimeMillis() - start)))
	
	Future {
	    for(i <- 0 to 1000000){
	    	val b = math.acos(0.5)
	    }
	}.onComplete(_ => println(System.currentTimeMillis() - start))
    
    Thread.sleep(10000)
}