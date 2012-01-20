package org.fogbeam.quoddy

class UserListService
{
	public List<UserList> getListsForUser( final User user )
	{
		List<UserList> lists = new ArrayList<UserList>();
		
		List<UserList> tempLists = UserList.executeQuery( "select list from UserList as list where list.owner = :owner",
														  ['owner':user] );
		if( tempLists )
		{
			lists.addAll( tempLists );
		}
		
		return lists;	
	}
	
	public List<UserList> getListsForUser( final User user, final int maxCount )
	{
		List<UserList> lists = new ArrayList<UserList>();

		List<UserList> tempLists = UserList.executeQuery( "select list from UserList as list where list.owner = :owner",
														  ['owner':user], ['max':maxCount] );

		if( tempLists )
		{
			lists.addAll( tempLists );
		}
											  
													  		
		return lists;
	}

	
}
