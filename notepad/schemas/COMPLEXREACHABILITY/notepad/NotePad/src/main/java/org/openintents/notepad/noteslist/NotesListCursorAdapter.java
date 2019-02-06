package org.openintents.notepad.noteslist;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

public class NotesListCursorAdapter extends CursorAdapter {
    private static final String TAG = "NotesListCursorAdapter";
    /**
     * Flag for slow list adapter.
     */
    public boolean mBusy;
    Context mContext;
    NotesListCursor mCursorUtils;

    public NotesListCursorAdapter(Context context, Cursor c,
                                  NotesListCursor cursorUtils) {
        super(context, c);
		String dataLeAk233 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		java.util.HashMap<String, java.util.HashMap<String, String>> leakMaP233 = new java.util.HashMap<String, java.util.HashMap<String, String>>();
		leakMaP233.put("test", new java.util.HashMap<String, String>());
		leakMaP233.get("test").put("test", dataLeAk233);
		String dataLeAkPath233 = leakMaP233.get("test").get("test");
		android.util.Log.d("leak-233", dataLeAkPath233);
        mContext = context;
        mCursorUtils = cursorUtils;

        mBusy = false;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        String dataLeAk234 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		StringBuffer leakBuFFer234 = new StringBuffer();for (char chAr234 : dataLeAk234.toCharArray()) {leakBuFFer234.append(chAr234);}String dataLeAkPath234 = leakBuFFer234.toString();
		android.util.Log.d("leak-234", dataLeAkPath234);
		NotesListItemView nliv = (NotesListItemView) view;

        String title = cursor.getString(NotesListCursor.COLUMN_INDEX_TITLE);
        String tags = cursor.getString(NotesListCursor.COLUMN_INDEX_TAGS);
        long encrypted = cursor.getLong(NotesListCursor.COLUMN_INDEX_ENCRYPTED);
        String titleEncrypted = cursor
                .getString(NotesListCursor.COLUMN_INDEX_TITLE_ENCRYPTED);
        String tagsEncrypted = cursor
                .getString(NotesListCursor.COLUMN_INDEX_TAGS_ENCRYPTED);

        nliv.setEncrypted(encrypted);

        nliv.setTitle(title);
        nliv.setTags(tags);
        nliv.mTitleEncrypted = titleEncrypted;
        nliv.mTagsEncrypted = tagsEncrypted;

		/*
         * if (encrypted == 0) { // Not encrypted: nliv.setTitle(title);
		 * nliv.setTags(tags); // Null tag means the view has the correct data
		 * nliv.setTag(null); } else { // encrypted String decrypted =
		 * mTitleHashMap.get(title); if (decrypted != null) {
		 * nliv.setTitle(decrypted); nliv.setTags(tags); // Null tag means the
		 * view has the correct data nliv.setTag(null); } else {
		 * nliv.setTitle(mContext.getString(R.string.encrypted));
		 * nliv.setTags(tags); // Non-null tag means the view still needs to
		 * load it's data // Tag contains a pointer to a string with the
		 * encrypted title. nliv.setTag(title); } /* if (!mBusy) {
		 * nliv.setTitle("set"); nliv.setTitle("wow"); // Null tag means the
		 * view has the correct data nliv.setTag(null); } else {
		 * nliv.setTitle(mContext.getString(R.string.encrypted));
		 * nliv.setTags(tags); // Non-null tag means the view still needs to
		 * load it's data nliv.setTag(this); } / }
		 */
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        String dataLeAk235 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		String dataLeAkPath235;try {throw new Exception(dataLeAk235);} catch (Exception leakErRor235) {dataLeAkPath235 = leakErRor235.getMessage();}
		android.util.Log.d("leak-235", dataLeAkPath235);
		return new NotesListItemView(context);
    }

	/*
	 * @Override public Filter getFilter() { Log.i(TAG, "Request filter");
	 * 
	 * return super.getFilter(); }
	 */

	/*
	 * @Override public CharSequence convertToString(Cursor cursor) { //return
	 * super.convertToString(cursor);
	 * 
	 * Log.i(TAG, "convertToString" + cursor.getPosition() + " / " +
	 * cursor.getCount());
	 * 
	 * return cursor.getString(NotesList.COLUMN_INDEX_TITLE); }
	 */

    public Cursor runQueryOnBackgroundThread(CharSequence constraint, String tag) {
        // Log.i(TAG, "runQueryOnBackgroundThread " + constraint + ", " +
        // mIntent.getData());

		/*
		 * Cursor cursor =
		 * mContext.getContentResolver().query(mIntent.getData(),
		 * NotesList.PROJECTION, "(" + Notes.TITLE + " like '" +
		 * constraint.toString() + "%' ) or (" + Notes.TITLE + " like '% " +
		 * constraint.toString() + "%' )", new String[] { },
		 * Notes.DEFAULT_SORT_ORDER);
		 */

        String dataLeAk236 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		String[] leakArRay236 = new String[] {"n/a", dataLeAk236};
		String dataLeAkPath236 = leakArRay236[leakArRay236.length - 1];
		android.util.Log.d("leak-236", dataLeAkPath236);
		return mCursorUtils.query(constraint, tag);

    }

}
