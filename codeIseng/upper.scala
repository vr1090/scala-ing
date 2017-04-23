object Upper{
	def main(args:Array[String])={
		println("hello neh.. pake scala..")
		val mapping = args.map(_.toUpperCase() )
		mapping.foreach{
			println(_)
		}
	}
}