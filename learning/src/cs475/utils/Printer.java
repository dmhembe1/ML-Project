package cs475.utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import cs475.Instance;
import cs475.structures.SparseVector;

public class Printer
{
  public static void printInstanceList(List<Instance> l)
  {
   for (Instance i : l)
     System.out.println("Label:" + i.getLabel().toString() + ", Vector:" + i.getFeatureVector().getVector());
   System.out.println();
  }
  
  public static void printLabelList(List<Instance> l){
	  for (Instance i: l)
		  System.out.println("Lable:" + i.getLabel().toString() + ", Old Label:" + i.get_orginalLabel().toString());
  }
  
  public static void writeLabelList(List<Instance> l) throws FileNotFoundException, UnsupportedEncodingException{
	  PrintWriter writer = new PrintWriter("Mapping", "UTF-8");
	  for (Instance i: l){
		  writer.println(i.getLabel().toString() + "," + i.get_orginalLabel().toString());
	  }
	  writer.close();
  }
}