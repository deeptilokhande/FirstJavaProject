package com.deepti.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceClass {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		//Create Callable task
//		Callable<String> task = ()->{ 
//			String s= "Callable from Thread :"+Thread.currentThread().getId();
//			Thread.sleep(1000);
//		    return s ;};

		//Use executorService to create thread
     	ExecutorService es = Executors.newSingleThreadExecutor();
     	
//		e.submit(()->{
//			System.out.println("Runnable from thread :"+Thread.currentThread().getId());		
//		});
     	
     	//submit the task to executor service and await for future to return result;
//     	Future<String> f = es.submit(task);
//     	f.get(1500,TimeUnit.MILLISECONDS);
//    	es.shutdown();
//     	
//     	System.out.println("Is future back yet?:"+f.isDone());
//     
//     
//     	System.out.println("From future: "+f.get());
//     	
//     	System.out.println("*****************");
//     	
//     	ExecutorService executor = Executors.newFixedThreadPool(1);
//
//     	Future<Integer> future = executor.submit(() -> {
//     	    try {
//     	        TimeUnit.SECONDS.sleep(2);
//     	        return 123;
//     	    }
//     	    catch (InterruptedException e) {
//     	        throw new IllegalStateException("task interrupted", e);
//     	    }
//     	});
//
//     	future.get(1, TimeUnit.SECONDS);
     	
     	int arr[] = new int[5];
     	System.out.println(arr);
     	
     	Callable<String> task = ()->{return "task1";};
     	Callable<String> task2 = ()->{ return "task2";};
     	Callable<String> task3 = ()->{return "task3";};
     	
		List<Callable<String>> clist = new ArrayList<>();
		clist.add(task);
		clist.add(task2);
		clist.add(task3);
		
		ExecutorService  e = Executors.newFixedThreadPool(5);
        List<Future<String>> f=  e.invokeAll(clist);	
        
        List<Runnable> tasksnotdoneList = e.shutdownNow();
        for(Runnable r : tasksnotdoneList) {
        	System.out.println(r.toString());
        }
        
        for(Future<String> f1 : f) {
        System.out.println(f1.get());
        
        }
	}

}
