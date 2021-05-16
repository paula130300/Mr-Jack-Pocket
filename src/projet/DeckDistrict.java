package projet;

import java.util.Stack;
import java.util.Collections;
import java.util.Collections;


public class DeckDistrict extends StartDistrict {
	
public static void MrJackNotVisible() { // méthode qui vérifier si une tuile est visible ou non
	 if (Toby.getPosition() == 1 || Watson.getPosition() == 1 || Sherlock.getPosition() == 1) {
	    	System.out.println("coucou1");
	    	int continuer1 = 1;
	    	while (continuer1 == 1) {
	        for (int i=0; i<case1Y.size();i ++) {
	        	
	        	if (case1Y.get(i).getSens()== 1 || case1Y.get(i).getSens()== 3 || case1Y.get(i).getSens()== 5) {
	        		case1Y.get(i).estVisible();}
	        	
	        	if (case1Y.get(i).getSens() == 2) {
	                case1Y.get(i).estVisible();
	                continuer1 = 0;	
	        	}
	        	else {
	        		continuer1 = 0;}}}}
	        	
	    	
	        	
	      if (Toby.getPosition() == 2 || Watson.getPosition() == 2 || Sherlock.getPosition() == 2) {
	    	  System.out.println("coucou2");
	    	  		int continuer2 = 1;
	            	while (continuer2 == 1) {
	                for (int i=0; i<case2Y.size();i ++) {
	                	
	                	if (case2Y.get(i).getSens()== 1 || case2Y.get(i).getSens()== 3 || case2Y.get(i).getSens()== 5) {
	                		case2Y.get(i).estVisible();}
	                	
	                	if (case2Y.get(i).getSens() == 2) {
	                        case2Y.get(i).estVisible();
	                        continuer2 = 0;	
	                	}
	                	else {
	                		continuer2 = 0;}}}}
	            
	      
	      if (Toby.getPosition() == 3 || Watson.getPosition() == 3 || Sherlock.getPosition() == 3) {
	    	  System.out.println("coucou3");
	    	  int continuer3=1;
	      	while (continuer3 ==1) {
	          for (int i=0; i<case3Y.size();i ++) {
	          	
	          	if (case3Y.get(i).getSens()== 1 || case3Y.get(i).getSens()== 3 || case3Y.get(i).getSens()== 5) {
	          		case3Y.get(i).estVisible();}
	          	
	          	if (case3Y.get(i).getSens() == 2) {
	                  case3Y.get(i).estVisible();
	                  continuer3 = 0;	
	          	}
	          	else {
	          		continuer3 = 0;}}}}
	      
	      if (Toby.getPosition() == 12 || Watson.getPosition() == 12 || Sherlock.getPosition() == 12) {
	    	  System.out.println("coucou12");
	    	  int continuer12 = 1;
	        	while (continuer12 == 1) {
	            for (int i=0; i<caseX1.size();i ++) {
	            	
	            	if (caseX1.get(i).getSens()== 2 || caseX1.get(i).getSens()== 4 || caseX1.get(i).getSens()== 5) {
	            		caseX1.get(i).estVisible();}
	            	
	            	if (caseX1.get(i).getSens() == 3) {
	                    caseX1.get(i).estVisible();
	                    continuer12 = 0;	
	            	}
	            	else {
	            		continuer12 = 0;}}}}
	        	
	      if (Toby.getPosition() == 11 || Watson.getPosition() == 11 || Sherlock.getPosition() == 11) {
	    	  System.out.println("coucou11");
	    	int  continuer11 = 1;
	      	while (continuer11 ==1) {
	          for (int i=0; i<caseX2.size();i ++) {
	          	
	          	if (caseX2.get(i).getSens()== 2 || caseX2.get(i).getSens()== 4 || caseX2.get(i).getSens()== 5) {
	          		caseX2.get(i).estVisible();}
	          	
	          	if (caseX2.get(i).getSens() == 3) {
	                  caseX2.get(i).estVisible();
	                  continuer11 = 0;	
	          	}
	          	else {
	          		continuer11 = 0;}}}}
	      	
	      if (Toby.getPosition() == 10 || Watson.getPosition() == 10 || Sherlock.getPosition() == 10) {
	    	  System.out.println("coucou10");
	    	  int continuer10 = 1;
	        	while (continuer10 == 1) {
	            for (int i=0; i<caseX3.size();i ++) {
	            	
	            	if (caseX3.get(i).getSens()== 2 || caseX3.get(i).getSens()== 4 || caseX3.get(i).getSens()== 5) {
	            		caseX3.get(i).estVisible();}
	            	
	            	if (caseX3.get(i).getSens() == 3) {
	                    caseX3.get(i).estVisible();
	                    continuer10 = 0;	
	            	}
	            	else {
	            		continuer10 = 0;}}}}
        	
      if (Toby.getPosition() == 4 || Watson.getPosition() == 4 || Sherlock.getPosition() == 4) {
    	  System.out.println("coucou4");
    	  int continuer4 =1;
          while ( continuer4 == 1) {
          for (int i=2; i<caseX1.size() && i !=1;i --) {
        	  
          	if (caseX1.get(i).getSens()== 2 || caseX1.get(i).getSens()== 4 || caseX1.get(i).getSens()== 5) {
          		caseX1.get(i).estVisible();}
          	
          	if (caseX1.get(i).getSens() == 1) {
                  caseX1.get(i).estVisible();
                  continuer4 =0;	
                  
          	}
          	else {
          		continuer4 =0;}}}}
        	
      
      if (Toby.getPosition() == 5 || Watson.getPosition() == 5 || Sherlock.getPosition() == 5) {
    	  System.out.println("coucou5");
    	  int continuer5 =1;
          while ( continuer5 == 1) {
            for (int i=2; i<caseX2.size() && i !=1;i --) {
            	
            	if (caseX2.get(i).getSens()== 2 || caseX2.get(i).getSens()== 4 || caseX2.get(i).getSens()== 5) {
            		caseX2.get(i).estVisible();}
            	
            	if (caseX2.get(i).getSens() == 1) {
                    caseX2.get(i).estVisible();
                    continuer5=0;	
            	}
            	else {
            		continuer5=0;}}}}
      
      if (Toby.getPosition() == 6 || Watson.getPosition() == 6 || Sherlock.getPosition() == 6) {
    	  System.out.println("coucou6");
    	int continuer6 =1;
        while ( continuer6 == 1) {
          for (int i=2; i<caseX3.size() && i !=1;i --) {
          	
          	if (caseX3.get(i).getSens()== 2 || caseX3.get(i).getSens()== 4 || caseX3.get(i).getSens()== 5) {
          		caseX3.get(i).estVisible();}
          	
          	if (caseX3.get(i).getSens() == 1) {
                  caseX3.get(i).estVisible();
                  continuer6 = 0;	
          	}
          	else {
          		continuer6 = 0;}}}}
      
      if (Toby.getPosition() == 9 || Watson.getPosition() == 9 || Sherlock.getPosition() == 9) {
    	  System.out.println("coucou9");
    	int continuer9 =1;
      	while ( continuer9 == 1) {
          for (int i=2; i<case1Y.size() && i !=1;i --) {
          	
          	if (case1Y.get(i).getSens()== 1 || case1Y.get(i).getSens()== 3 || case1Y.get(i).getSens()== 5) {
          		case1Y.get(i).estVisible();}
          	
          	if (case1Y.get(i).getSens() == 4) {
                  case1Y.get(i).estVisible();
                  continuer9 = 0;	
          	}
          	else {
          		continuer9 = 0;	}}}}
          	
      	
          	
        if (Toby.getPosition() == 8|| Watson.getPosition() == 8 || Sherlock.getPosition() == 8) {
        	System.out.println("coucou8");
        	int continuer8 =1;
        	while ( continuer8 == 1) {
                  for (int i=2; i<case2Y.size() && i !=1;i --) {
                  	
                  	if (case2Y.get(i).getSens()== 1 || case2Y.get(i).getSens()== 3 || case2Y.get(i).getSens()== 5) {
                  		case2Y.get(i).estVisible();}
                  	
                  	if (case2Y.get(i).getSens() == 4) {
                          case2Y.get(i).estVisible();
                          continuer8 =0;;	
                  	}
                  	else {
                  		continuer8 =0;}}}}
              
        
        if (Toby.getPosition()== 7 || Watson.getPosition() == 7 || Sherlock.getPosition() == 7) {
        	System.out.println("coucou7");
        	int continuer7 =1;
        	while ( continuer7 == 1) {
            for (int i=2; i<case3Y.size() && i !=1;i --) {
            	
            	if (case3Y.get(i).getSens()== 1 || case3Y.get(i).getSens()== 3 || case3Y.get(i).getSens()== 5) {
            		case3Y.get(i).estVisible();}
            	
            	if (case3Y.get(i).getSens() == 4) {
                    case3Y.get(i).estVisible();
                	continuer7 = 0;
            	}
            	else {
            		continuer7=0;}}}}
  
}}