package com.pkg_dataframe

import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types._

object DataFramesBasics extends App {

  // creating a SparkSession
  val spark = SparkSession.builder()
    .appName("DataFrames Basics")
    .config("spark.master", "local")
    .getOrCreate()

  // reading a DF
  val firstDF = spark.read
  .format("json")
  .option("inferSchema", "true")
   .load("resources/data/cars.json")

  // showing a DF
  // showing a DF
  firstDF.show()
  firstDF.printSchema()

  // get rows
  firstDF.take(10).foreach(println)
}
