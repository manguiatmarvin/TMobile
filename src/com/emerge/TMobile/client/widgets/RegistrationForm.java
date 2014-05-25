package com.emerge.TMobile.client.widgets;


import com.google.gwt.user.client.History;
import com.smartgwt.client.data.DataSource;  
import com.smartgwt.client.data.fields.DataSourcePasswordField;  
import com.smartgwt.client.data.fields.DataSourceTextField;  
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.ButtonItem;  
import com.smartgwt.client.widgets.form.fields.CheckboxItem;  
import com.smartgwt.client.widgets.form.fields.HeaderItem;  
import com.smartgwt.client.widgets.form.fields.PasswordItem;  
import com.smartgwt.client.widgets.form.fields.events.ClickEvent;  
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;  
import com.smartgwt.client.widgets.form.validator.CustomValidator;  
import com.smartgwt.client.widgets.form.validator.MatchesFieldValidator;  
import com.smartgwt.client.widgets.form.validator.RegExpValidator;  
import com.smartgwt.client.widgets.layout.VLayout;
  

public class RegistrationForm extends VLayout{

	public RegistrationForm(){
		
		DataSource dataSource = new DataSource();  
		  
	    DataSourceTextField firstNameField = new DataSourceTextField("firstName", "First Name", 50, true);  
	    DataSourceTextField lastNameField = new DataSourceTextField("lastName", "Last Name", 50, true);  
	    DataSourceTextField emailField = new DataSourceTextField("email", "Email", 100, true);  

	    RegExpValidator emailValidator = new RegExpValidator();  
	    emailValidator.setErrorMessage("Invalid email address");  
	    emailValidator.setExpression("^([a-zA-Z0-9_.\\-+])+@(([a-zA-Z0-9\\-])+\\.)+[a-zA-Z0-9]{2,4}$");  
	      
	    emailField.setValidators(emailValidator);  

	    DataSourcePasswordField passwordField = new DataSourcePasswordField("password", "Password", 20, true);  

	    dataSource.setFields(firstNameField, lastNameField, emailField, passwordField);  

	    final DynamicForm form = new DynamicForm();  
	    form.setDataSource(dataSource);  
	    form.setUseAllDataSourceFields(true);  

	    HeaderItem header = new HeaderItem();  
	    header.setDefaultValue("Registration Form");  

	    PasswordItem passwordItem = new PasswordItem();  
	    passwordItem.setName("password");  

	    PasswordItem passwordItem2 = new PasswordItem();  
	    passwordItem2.setName("password2");  
	    passwordItem2.setTitle("Password Again");  
	    passwordItem2.setRequired(true);  
	    passwordItem2.setLength(20);  

	    MatchesFieldValidator matchesValidator = new MatchesFieldValidator();  
	    matchesValidator.setOtherField("password");  
	    matchesValidator.setErrorMessage("Passwords do not match");          
	    passwordItem2.setValidators(matchesValidator);  

	    CheckboxItem acceptItem = new CheckboxItem();  
	    acceptItem.setName("acceptTerms");  
	    acceptItem.setTitle("I accept the terms of use.");  
	    acceptItem.setDefaultValue(false);  
	    CustomValidator isTrueValidator = new CustomValidator() {  

	        @Override  
	        protected boolean condition(Object value) {  
	            if (new Boolean(true).equals(value)) return true;  
	            return false;  
	        }  
	          
	    };  
	    isTrueValidator.setErrorMessage("You must accept the terms of use to continue");  
	    acceptItem.setValidators(isTrueValidator);  
	    acceptItem.setWidth(150);  

	    ButtonItem validateItem = new ButtonItem();  
	    validateItem.setTitle("Validate");  
	    validateItem.addClickHandler(new ClickHandler() {  
	        public void onClick(ClickEvent event) {  
	            form.validate(false);
	            History.newItem("audit");
	        }  
	    });  

	    form.setFields(header, passwordItem, passwordItem2, acceptItem, validateItem);  
	      
	    form.setValue("firstName", "Bob");  
	    form.setValue("email", "bob@.com");  
	    form.setValue("password", "sekrit");  
	    form.setValue("password2", "fatfinger"); 
	    this.addMember(form);
		
	}
              
}
