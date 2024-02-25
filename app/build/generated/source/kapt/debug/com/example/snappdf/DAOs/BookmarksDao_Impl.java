package com.example.snappdf.DAOs;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.snappdf.Entities.BookmarksEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookmarksDao_Impl implements BookmarksDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BookmarksEntity> __insertionAdapterOfBookmarksEntity;

  public BookmarksDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookmarksEntity = new EntityInsertionAdapter<BookmarksEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `bookmarks` (`id`,`bookId`,`pageNub`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final BookmarksEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getBookId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getBookId());
        }
        statement.bindLong(3, entity.getPageNub());
      }
    };
  }

  @Override
  public Object addBookmarks(final BookmarksEntity entity, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBookmarksEntity.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object getBookmarks(final String bookId,
      final Continuation<? super List<BookmarksEntity>> arg1) {
    final String _sql = "SELECT * FROM bookmarks WHERE bookId == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (bookId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, bookId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<BookmarksEntity>>() {
      @Override
      @NonNull
      public List<BookmarksEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfBookId = CursorUtil.getColumnIndexOrThrow(_cursor, "bookId");
          final int _cursorIndexOfPageNub = CursorUtil.getColumnIndexOrThrow(_cursor, "pageNub");
          final List<BookmarksEntity> _result = new ArrayList<BookmarksEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final BookmarksEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpBookId;
            if (_cursor.isNull(_cursorIndexOfBookId)) {
              _tmpBookId = null;
            } else {
              _tmpBookId = _cursor.getString(_cursorIndexOfBookId);
            }
            final int _tmpPageNub;
            _tmpPageNub = _cursor.getInt(_cursorIndexOfPageNub);
            _item = new BookmarksEntity(_tmpId,_tmpBookId,_tmpPageNub);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
