import org.apache.spark.SparkConf

/**
  * Application that outputs the Spark configurations.
  * Specifically we want to test whether long strings of multiple arg=values are passed through correctly.
  * E.g. 
  * dcos spark run --submit-args="--conf=spark.driver.extraJavaOptions='val1 val2 val3' --class MultiConfs"
  */ 
object MultiConfs {
    def main(args: Array[String]): Unit = {
        println("Running MultiConfs app. Printing out all config values:")
        val APPNAME = "MultiConfs App"
        val conf = new SparkConf().setAppName(APPNAME)
        conf.getAll.foreach(println)
    }
}