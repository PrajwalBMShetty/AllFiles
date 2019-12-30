package STREAMING;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class testc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>ls=new ArrayList<Product>();
		Product p1=new Product(1,"Tv",250000f);
		Product p2=new Product(2,"Bench",150000f);
		Product p3=new Product(3,"computer",850000f);
		Product p4=new Product(4,"washing machine",650000f);
        ls.add(p1);
        ls.add(p2);
        ls.add(p3);
        ls.add(p4);
        ls.add(new Product(5,"Mobile",4000f));
        ls.add(new Product(6,"cooler",900000f));
       // Product productA=ls.stream().max((p1,p2))->p1.price>p2.price
        //List<Float>productPriceList=new ArrayList<Float>();
      //  List<String>productName=new ArrayList<String>();

        //for(Product s:ls) {
   
        	//System.out.println("Id is :"+s.getId()+"Name:"+s.getName()+"Price :"+s.getPrice());
        ///if(s.price<30000) {
       // 	productName.add(s.name);
      //  	productPriceList.add(s.price);
      //  }
      //  }
       // System.out.print(productName);
       // System.out.println(productPriceList);
        //List<Float>ls2 =ls.stream().filter(p->p.price==300000).map(p->p.price).collect(Collectors.toList());
        //List<String>ls3 =ls.stream().filter(p->p.price>300000).map(p->p.name).collect(Collectors.toList());
        //ls.stream().filter(p->p.price==650000).forEach(p->System.out.println(p.name));
        //System.out.println(ls2);
        //System.out.println(ls3);
        double totalPrice3=ls.stream().collect(Collectors.summingDouble(p->p.price));
       // System.out.println(totalPrice3);
        Product pr=ls.stream().max((pr1,pr2)->pr1.price<pr2.price?1:-1).get();
        //System.out.println(pr.price);
        Product pr2=ls.stream().max((product1,product2)->product1.price>product2.price?1:-1).get();
        //System.out.println(pr2.price);
        //long count=ls.stream().filter(predicate)
        //Set<Float>ls2 =ls.stream().filter(p->p.price>300000).map(p->p.price).collect(Collectors.toSet());
        //System.out.println(ls2);
     
        //Map<Integer,String>productPriceMap=ls.stream().collect(Collectors.toMap(p->p.id,p->p.name));
	    //System.out.println(productPriceMap);
        List<Float> ppls=ls.stream().map(Product::getPrice).collect(Collectors.toList());
        System.out.println(ppls );
	}
	
}
