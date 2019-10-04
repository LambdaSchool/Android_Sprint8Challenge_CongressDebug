Albert Yakubov 
Congress Person Overview 
Debug

Issue 1:
The details activity is crassing

Issue 1a: 
 Cannot create an instance of class 

null pointers were wrong in places, changed to correct null pointer call

view model was structured wrong
      //  viewModel = ViewModelProviders.of(this).get(CongresspersonProfileViewModel::class.java)
        viewModel = CongresspersonProfileViewModel(memberId)