package com.example.gsrtcandroidapps;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import static com.example.gsrtcandroidapps.Addip.SERVER_URL;



import android.util.Log;



public class Background {
	
	static String ip=SERVER_URL;
	private static String NAMESPACE = "http://tempuri.org/";
	private static String URL = "http://"+ip+"/WebSite/Service.asmx";
	private static String SOAP_ACTION = "http://tempuri.org/";
	//No use
	
	public static String[] invokeHelloWorldWS(String name, String webMethName) {
		String[] resTxt=new String[100];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 int n=Integer.parseInt(result.getProperty(0).toString());
			resTxt[0]=""+n;
			
			for(int i=1;i<=n*3;i++)
				 {
				resTxt[i]=result.getProperty(i).toString();
				
				//Log.i ("info", resTxt[0].toString ());
			 }
				
			
		} catch (Exception e) {
			e.printStackTrace();
			resTxt= new String[]{"Error","Error"};
			
		} 
		
		return resTxt;
	}
	
	//history
			public static String[] userhistorya(String name, String webMethName) {
				String[] resTxt=new String[5000];
				// Create request
				SoapObject request = new SoapObject(NAMESPACE, webMethName);
				// Property which holds input parameters
				PropertyInfo send= new PropertyInfo();
				// Set Name
				send.setName("bid");
				// Set Value
				send.setValue(name);
				// Set dataType
				send.setType(String.class);
				// Add the property to request object
				request.addProperty(send);
				// Create envelope
				SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
						SoapEnvelope.VER11);
				envelope.dotNet = true;
				// Set output SOAP object
				envelope.setOutputSoapObject(request);
				// Create HTTP call object
				HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

				try {
					// Invole web service
					androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
					// Get the response
					//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
					 SoapObject result=(SoapObject)envelope.getResponse();
					//fetch all the row of the Soap result
					 int n=Integer.parseInt(result.getProperty(0).toString());
					resTxt[0]=""+n;
					
					for(int i=1;i<=n*4;i++)
						 {
						resTxt[i]=result.getProperty(i).toString();
						
						//Log.i ("info", resTxt[0].toString ());
					 }
						
					
				} catch (Exception e) {
					e.printStackTrace();
					Log.i ("info", e.toString ());
					resTxt= new String[]{"Error","Error"};
					
				} 
				
				return resTxt;
			}
	
	//For Bus Search
	public static String[] busdetail(String name, String webMethName) {
		String[] resTxt=new String[100];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 int n=Integer.parseInt(result.getProperty(0).toString());
			resTxt[0]=""+n;
			
			for(int i=1;i<=n*6;i++)
				 {
				resTxt[i]=result.getProperty(i).toString();
				
				//Log.i ("info", resTxt[0].toString ());
			 }
				
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.i ("info", e.toString ());
			resTxt= new String[]{"Error","Error"};
			
		} 
		
		return resTxt;
	}
	
	//get cancelld ticket details from pnr
	
		public static String[] Cancelticketd(String name, String webMethName) {
			String[] resTxt=new String[100];
			// Create request
			SoapObject request1 = new SoapObject(NAMESPACE, webMethName);
			// Property which holds input parameters
			PropertyInfo send1= new PropertyInfo();
			// Set Name
			send1.setName("name");
			// Set Value
			send1.setValue(name);
			// Set dataType
			send1.setType(String.class);
			// Add the property to request object
			request1.addProperty(send1);
			// Create envelope
			SoapSerializationEnvelope envelope1= new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			envelope1.dotNet = true;
			// Set output SOAP object
			envelope1.setOutputSoapObject(request1);
			// Create HTTP call object
			HttpTransportSE androidHttpTransport1 = new HttpTransportSE(URL);

			try {
				// Invole web service
				androidHttpTransport1.call(SOAP_ACTION+webMethName,envelope1);
				// Get the response
				//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
				 SoapObject result=(SoapObject)envelope1.getResponse();
				//fetch all the row of the Soap result
				 int n=Integer.parseInt(result.getProperty(0).toString());
				resTxt[0]=""+n;
				
				for(int i=1;i<=n*3;i++)
					 {
					resTxt[i]=result.getProperty(i).toString();
					
					//Log.i ("info", resTxt[0].toString ());
				 }
					
				
			} catch (Exception e) {
				e.printStackTrace();
				Log.i ("info", e.toString ());
				resTxt= new String[]{"Error","Error"};
				
			} 
			
			return resTxt;
		}
		//bus seat search
		
		public static String[] busseatsearch(String name, String webMethName) {
			String[] resTxt=new String[100];
			// Create request
			SoapObject request1 = new SoapObject(NAMESPACE, webMethName);
			// Property which holds input parameters
			PropertyInfo send1= new PropertyInfo();
			// Set Name
			send1.setName("tripcode");
			// Set Value
			send1.setValue(name);
			// Set dataType
			send1.setType(String.class);
			// Add the property to request object
			request1.addProperty(send1);
			// Create envelope
			SoapSerializationEnvelope envelope1= new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			envelope1.dotNet = true;
			// Set output SOAP object
			envelope1.setOutputSoapObject(request1);
			// Create HTTP call object
			HttpTransportSE androidHttpTransport1 = new HttpTransportSE(URL);

			try {
				// Invole web service
				androidHttpTransport1.call(SOAP_ACTION+webMethName,envelope1);
				// Get the response
				//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
				 SoapObject result=(SoapObject)envelope1.getResponse();
				//fetch all the row of the Soap result
				 
					resTxt[0]=result.getProperty(0).toString();
					
					//Log.i ("info", resTxt[0].toString ());
				 
					
				
			} catch (Exception e) {
				e.printStackTrace();
				Log.i ("info", e.toString ());
				resTxt= new String[]{"Error","Error"};
				
			} 
			
			return resTxt;
		}
		
		//seat no using pnrnoo
		
			public static String[] busseatusingpnr(String name, String webMethName) {
				String[] resTxt=new String[100];
				// Create request
				SoapObject request1 = new SoapObject(NAMESPACE, webMethName);
				// Property which holds input parameters
				PropertyInfo send1= new PropertyInfo();
				// Set Name
				send1.setName("pnrno");
				// Set Value
				send1.setValue(name);
				// Set dataType
				send1.setType(String.class);
				// Add the property to request object
				request1.addProperty(send1);
				// Create envelope
				SoapSerializationEnvelope envelope1= new SoapSerializationEnvelope(
						SoapEnvelope.VER11);
				envelope1.dotNet = true;
				// Set output SOAP object
				envelope1.setOutputSoapObject(request1);
				// Create HTTP call object
				HttpTransportSE androidHttpTransport1 = new HttpTransportSE(URL);

				try {
					// Invole web service
					androidHttpTransport1.call(SOAP_ACTION+webMethName,envelope1);
					// Get the response
					//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
					 SoapObject result=(SoapObject)envelope1.getResponse();
					//fetch all the row of the Soap result
					 int n=Integer.parseInt(result.getProperty(0).toString());
					resTxt[0]=""+n;
					
					for(int i=1;i<=n+2;i++)
						 {
						resTxt[i]=result.getProperty(i).toString();
						
						//Log.i ("info", resTxt[0].toString ());
					 }
						
					
				} catch (Exception e) {
					e.printStackTrace();
					Log.i ("info", e.toString ());
					resTxt= new String[]{"Error","Error"};
					
				} 
				
				return resTxt;
			}
	//map activity
	public static String[] mapactivity(String name, String webMethName) {
		String[] resTxt=new String[5000];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 
				resTxt[0]=result.getProperty(0).toString();
				
				//Log.i ("info", resTxt[0].toString ());
			 
				
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.i ("info", e.toString ());
			resTxt= new String[]{"Error"};
			
		} 
		
		return resTxt;
	}
	//confirm ticket cancel
	public static String[] confirmticketcancel(String name, String webMethName) {
		String[] resTxt=new String[100];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 
				resTxt[0]=result.getProperty(0).toString();
				
				//Log.i ("info", resTxt[0].toString ());
			 
				
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.i ("info", e.toString ());
			resTxt= new String[]{"Error"};
			
		} 
		
		return resTxt;
	}
	//pba last
	public static String[] lastpb(String name, String webMethName) {
		String[] resTxt=new String[100];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 
				resTxt[0]=result.getProperty(0).toString();
				
				//Log.i ("info", resTxt[0].toString ());
			 
				
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.i ("info", e.toString ());
			resTxt= new String[]{"Error"};
			
		} 
		
		return resTxt;
	}
	
	//data using tripcode stpt,endpt,journey date
		public static String[] getdata(String name, String webMethName) {
			String[] resTxt=new String[100];
			// Create request
			SoapObject request = new SoapObject(NAMESPACE, webMethName);
			// Property which holds input parameters
			PropertyInfo send= new PropertyInfo();
			// Set Name
			send.setName("name");
			// Set Value
			send.setValue(name);
			// Set dataType
			send.setType(String.class);
			// Add the property to request object
			request.addProperty(send);
			// Create envelope
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			envelope.dotNet = true;
			// Set output SOAP object
			envelope.setOutputSoapObject(request);
			// Create HTTP call object
			HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

			try {
				// Invole web service
				androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
				// Get the response
				//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
				 SoapObject result=(SoapObject)envelope.getResponse();
				//fetch all the row of the Soap result
				 
				 if((resTxt[0]=result.getProperty(0).toString()).equals("FALSE"))
				 {
					 resTxt[0]="FALSE";
					 Log.i ("infohcfsdjs", resTxt[0].toString());
				 }
				 else
				 {
					
					resTxt[1]=result.getProperty(1).toString();
					resTxt[2]=result.getProperty(2).toString();
					resTxt[3]=result.getProperty(3).toString();
					Log.i ("infohcfsdjsjay", resTxt[0].toString ());
				 }
					
					
				 
					
				
			} catch (Exception e) {
				e.printStackTrace();
				Log.i ("info", e.toString ());
				resTxt= new String[]{"Error"};
				
			} 
			
			return resTxt;
		}
	
	//bus reserved seat
	public static String[] busreservedseat(String name, String webMethName) {
		String[] resTxt=new String[100];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 int n=Integer.parseInt(result.getProperty(0).toString());
			resTxt[0]=""+n;
			
			for(int i=1;i<=n;i++)
				 {
				resTxt[i]=result.getProperty(i).toString();
				
				Log.i ("infohqh", resTxt[i].toString ());
			 }
				
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.i ("info", e.toString ());
			resTxt= new String[]{"Error","Error"};
			
		} 
		
		return resTxt;
	}
	
	//userdetail
		public static String[] userdetail(String name, String webMethName) {
			String[] resTxt=new String[100];
			// Create request
			SoapObject request = new SoapObject(NAMESPACE, webMethName);
			// Property which holds input parameters
			PropertyInfo send= new PropertyInfo();
			// Set Name
			send.setName("name");
			// Set Value
			send.setValue(name);
			// Set dataType
			send.setType(String.class);
			// Add the property to request object
			request.addProperty(send);
			// Create envelope
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			envelope.dotNet = true;
			// Set output SOAP object
			envelope.setOutputSoapObject(request);
			// Create HTTP call object
			HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

			try {
				// Invole web service
				androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
				// Get the response
				//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
				 SoapObject result=(SoapObject)envelope.getResponse();
				//fetch all the row of the Soap result
				
					resTxt[0]=result.getProperty(0).toString();
					
					Log.i ("infohh", resTxt[0].toString ());
				 
					
				
			} catch (Exception e) {
				e.printStackTrace();
				Log.i ("info", e.toString ());
				resTxt= new String[]{"Error","Error"};
				
			} 
			
			return resTxt;
		}
		//userdetail
				public static String[] deletedatatemp1(String name, String webMethName) {
					String[] resTxt=new String[100];
					// Create request
					SoapObject request = new SoapObject(NAMESPACE, webMethName);
					// Property which holds input parameters
					PropertyInfo send= new PropertyInfo();
					// Set Name
					send.setName("name");
					// Set Value
					send.setValue(name);
					// Set dataType
					send.setType(String.class);
					// Add the property to request object
					request.addProperty(send);
					// Create envelope
					SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
							SoapEnvelope.VER11);
					envelope.dotNet = true;
					// Set output SOAP object
					envelope.setOutputSoapObject(request);
					// Create HTTP call object
					HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

					try {
						// Invole web service
						androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
						// Get the response
						//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
						 SoapObject result=(SoapObject)envelope.getResponse();
						//fetch all the row of the Soap result
						
							resTxt[0]=result.getProperty(0).toString();
							
							Log.i ("infodhh", resTxt[0].toString ());
						 
							
						
					} catch (Exception e) {
						e.printStackTrace();
						Log.i ("info", e.toString ());
						resTxt= new String[]{"Error","Error"};
						
					} 
					
					return resTxt;
				}
	
	//For internal station
	public static String[] Internalstation(String name, String webMethName) {
		String[] resTxt=new String[100];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 int n=Integer.parseInt(result.getProperty(0).toString());
			resTxt[0]=""+n;
			
			for(int i=1;i<=n;i++)
				 {
				resTxt[i]=result.getProperty(i).toString();
				
				//Log.i ("info", resTxt[0].toString ());
			 }
				
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.i ("info", e.toString ());
			resTxt= new String[]{"Error","Error"};
			
		} 
		
		return resTxt;
	}
	//Ticket Detail
		public static String[] ticketcharge(String name, String webMethName) {
			String[] resTxt=new String[100];
			// Create request
			SoapObject request = new SoapObject(NAMESPACE, webMethName);
			// Property which holds input parameters
			PropertyInfo send= new PropertyInfo();
			// Set Name
			send.setName("name");
			// Set Value
			send.setValue(name);
			// Set dataType
			send.setType(String.class);
			// Add the property to request object
			request.addProperty(send);
			// Create envelope
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			envelope.dotNet = true;
			// Set output SOAP object
			envelope.setOutputSoapObject(request);
			// Create HTTP call object
			HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

			try {
				// Invole web service
				androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
				// Get the response
				//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
				 SoapObject result=(SoapObject)envelope.getResponse();
				//fetch all the row of the Soap result
			
				
				for(int i=0;i<5;i++)
					 {
					resTxt[i]=result.getProperty(i).toString();
					
					Log.i ("fare", resTxt[i].toString ());
				 }
					
				
			} catch (Exception e) {
				e.printStackTrace();
				Log.i ("info", e.toString ());
				resTxt= new String[]{"Error","Error"};
				
			} 
			
			return resTxt;
		}
	//For Login
	public static String[] invokeHelloWorldWSL(String name, String webMethName) {
		
		String[] resTxt;
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			resTxt= new String[]{result.getProperty(0).toString()};
			Log.i ("info", resTxt[0].toString());
			
			

		} catch (Exception e) {
			e.printStackTrace();
			resTxt= new String[]{"Error","Error"};
			
		} 
		
		return resTxt;
	}
	
	//For Logout
	public static String invokeHelloWorldp(String name, String webMethName) {
		String resTxt;
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
		    //	SoapObject response = (SoapObject) envelope.bodyIn;
			SoapObject response = (SoapObject) envelope.getResponse();
			//Object response= (Object)envelope.getResponse();
			//fetch all the row of the Soap result
			resTxt= new String();
			resTxt=response.getProperty(0).toString();
			Log.i ("info", resTxt.toString ());
			
			

		} catch (Exception e) {
			e.printStackTrace();
			resTxt= new String();
			Log.i ("info", resTxt.toString());
			resTxt="Error";
			
		} 
		
		return resTxt;
	}
	//Bus Search For Login User
	public static String[] busdetaill(String name, String webMethName) {
		String[] resTxt=new String[100];
		// Create request
		SoapObject request = new SoapObject(NAMESPACE, webMethName);
		// Property which holds input parameters
		PropertyInfo send= new PropertyInfo();
		// Set Name
		send.setName("name");
		// Set Value
		send.setValue(name);
		// Set dataType
		send.setType(String.class);
		// Add the property to request object
		request.addProperty(send);
		// Create envelope
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		// Set output SOAP object
		envelope.setOutputSoapObject(request);
		// Create HTTP call object
		HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

		try {
			// Invole web service
			androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
			// Get the response
			//SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			 SoapObject result=(SoapObject)envelope.getResponse();
			//fetch all the row of the Soap result
			 int n=Integer.parseInt(result.getProperty(0).toString());
			resTxt[0]=""+n;
			
			for(int i=1;i<=n*7;i++)
				 {
				resTxt[i]=result.getProperty(i).toString();
				
			 }
				
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.i ("info", e.toString ());
			resTxt= new String[]{"Error","Error"};
			
		} 
		
		return resTxt;
	}
	
	
	
}
