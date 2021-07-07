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

Successfully created first UI test to see if it returns correct details for the person clicked

found another bug in null pointer to middle name -> fixed


Display name builder was not matching with Unit Tests, Its matching now :

 private fun buildDisplayName(): String {
        val nameBuilder = StringBuilder()
        nameBuilder.append(firstName).append(" ")
        if (middleName != null) {
            nameBuilder.append(middleName).append(" ")
        }
        nameBuilder.append(lastName)
        return nameBuilder.toString().toLowerCase()
    }
           /* private fun buildDisplayName(): String {
                val nameBuilder = StringBuilder()
                nameBuilder.append(firstName)
                if (middleName != null) {
                    nameBuilder.append(middleName).append(" ")
                }
                nameBuilder.append(lastName)
                return nameBuilder.toString().toLowerCase()
            }*/