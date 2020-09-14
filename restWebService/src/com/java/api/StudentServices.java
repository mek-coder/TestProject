package com.java.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Student")
public class StudentServices {
	/*
	@Context
	Uriinfo uriinfo;
	*/
	/*Static {
	StudentDao studentlist = new StudentDao();
	} */
	@GET
	@Path("cTof")
	@Produces(MediaType.APPLICATION_JSON_PATCH_JSON)
	public String convertFtoC() {
		String result = "hi";
		return result;
	}
	
	@GET
	@Path("getList")
	@Produces(MediaType.APPLICATION_JSON_PATCH_JSON)
    public List<Student> getStudentListjson() {
		 List<Student> sList= new ArrayList<Student>(); 
    	 StudentDao studentlist = new StudentDao();
    	 sList.addAll(studentlist.getStudents().values());
    	return sList;
    }
	
	
	@POST
	@Path("addStudent")
	//@Path("addStudent/{id}/{name}")
//	@Consumes(MediaType.APPLICATION_JSON)
  //  public Response addStudent(@PathParam("id") int sid , @PathParam("name") String sName ) {
	public Response addStudent() {
			
		
		try {
		 Student s = new Student(5, "sam","Grade 9", new String[]{"La1","Ma1","Phy1", "Sp1"}) ;
		 
    	 StudentDao studentlist = new StudentDao();
    	 studentlist.addStudent(s);
    	 String output = "Student  is added to the StudenList";
    	 
    	 return Response.status(200).entity(output).build();
    	 
    	 
		 } catch (Exception e) {
			 String output = " Error has occured while adding the Student  ";
			 return Response.status(201).entity(output).build();
		 }
    }
	
	
	@DELETE
    @Path("/{param}")
    public Response deleteMsg(@PathParam("param") int sid ) {
        String output = "DELETED: : " + sid;
        return Response.status(200).entity(output).build();
    }
	
	
	@GET
	@Path("login")
	@Produces("application/xml")
	public String requestLogin() {
		StringBuilder myLogin = new StringBuilder();
		myLogin.append("<note>");
		myLogin.append("<body> Please enter Your Login info </body>");
		myLogin.append("</note>");
		return myLogin.toString();
	}
	
	@GET
	@Path("getListXml")
	@Produces(MediaType.TEXT_XML)
    public List<Student> getStudentListXml() {
		 List<Student> sList= new ArrayList<Student>(); 
    	 StudentDao studentlist = new StudentDao();
    	 sList.addAll(studentlist.getStudents().values());
    	//System.out.println(sList.get(0));
    	return sList;
    }

}
