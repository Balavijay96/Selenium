package com.step_definition;

import java.io.IOException;

import com.Maven_Practice.Baseclass;
import com.page.Page_Object_Manager;
import com.property.Reader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Step_Definition extends Baseclass {
	Page_Object_Manager pom= new Page_Object_Manager(driver);
	@Given("^user Must Enter The Url Before Login$")
	public void user_Must_Enter_The_Url_Before_Login() throws IOException {
		url(Reader.getInstance().getUrl());
	}

	@When("^user Enter the Username In Username Field$")
	public void user_Enter_the_Username_In_Username_Field() throws IOException {
		sent(pom.getL().getUsername(), Reader.getInstance().getUserName());
	}

	@And("^user Enter the Password In Password Field$")
	public void user_Enter_the_Password_In_Password_Field() throws IOException{
		sent(pom.getL().getPassword(),Reader.getInstance().getPassword());
	}

	@Then("^user Clicks The Login It Navigates To The Search Hotel$")
	public void user_Clicks_The_Login_It_Navigates_To_The_Search_Hotel() {
		click(pom.getL().getLogin());
	}
	@When("user Select The Location In Dropdown Box")
	public void user_select_the_location_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getLocation(),pom.getSearch().getLocation());	
	}
	@When("user Select The Hotels In Dropdown Box")
	public void user_select_the_hotels_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getHotels(), pom.getSearch().getHotels());
	}
	@When("user Select The RoomType In Dropdown Box")
	public void user_select_the_room_type_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getRoom(), pom.getSearch().getRoom());
	}
	@When("user Select The Numbers Of Room In Dropdown Box")
	public void user_select_the_numbers_of_room_in_dropdown_box() throws IOException {
		selectVisibleText( pom.getSearch().getNum(),Reader.getInstance().getNums() );
	}
	@When("user Enters The Check-In Date In CheckIn Date Field")
	public void user_enters_the_check_in_date_in_check_in_date_field() throws IOException {
		sent(pom.getSearch().getIn(), Reader.getInstance().getIn());
	}
	@When("user Enters The Check-Out Date In CheckOut Date Field")
	public void user_enters_the_check_out_date_in_check_out_date_field() throws IOException {
		sent(pom.getSearch().getOut(), Reader.getInstance().getOut());
	}
	@When("user Select The Adults Per Room In Dropdown Box")
	public void user_select_the_adults_per_room_in_dropdown_box() throws IOException {
		selectVisibleText(pom.getSearch().getAdult(),Reader.getInstance().getAdult());
	}
	@When("user Select The Children Per Room In Dropdown Box")
	public void user_select_the_children_per_room_in_dropdown_box() throws IOException {
		selectValue(Reader.getInstance().getChild(), pom.getSearch().getChild());
	}
	@Then("user Clicks Search")
	public void user_clicks_search() {
		click(pom.getSearch().getSearch());
	}
	@When("user Select The Hotel Using Radiobutton")
	public void user_select_the_hotel_using_radiobutton() {
		click(pom.getHotel().getRadio());
	
	
	}
	@Then("user Clicks Continue It Navigates To The Payment Page")
	public void user_clicks_continue_it_navigates_to_the_payment_page() {
		click(pom.getHotel().getContinues());
	}


}





