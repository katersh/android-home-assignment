package com.katya.androidassignment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    static int tilesVisible = 12;

    void showTiles() {
        final Button button00 = (Button) findViewById(R.id.imageButton00);
        final Button button01 = (Button) findViewById(R.id.imageButton01);
        final Button button02 = (Button) findViewById(R.id.imageButton02);

        final Button button10 = (Button) findViewById(R.id.imageButton10);
        final Button button11 = (Button) findViewById(R.id.imageButton11);
        final Button button12 = (Button) findViewById(R.id.imageButton12);

        final Button button20 = (Button) findViewById(R.id.imageButton20);
        final Button button21 = (Button) findViewById(R.id.imageButton21);
        final Button button22 = (Button) findViewById(R.id.imageButton22);

        final Button button30 = (Button) findViewById(R.id.imageButton30);
        final Button button31 = (Button) findViewById(R.id.imageButton31);
        final Button button32 = (Button) findViewById(R.id.imageButton32);

        button00.setVisibility(View.VISIBLE);
        button01.setVisibility(View.VISIBLE);
        button02.setVisibility(View.VISIBLE);
        button10.setVisibility(View.VISIBLE);
        button11.setVisibility(View.VISIBLE);
        button12.setVisibility(View.VISIBLE);
        button20.setVisibility(View.VISIBLE);
        button21.setVisibility(View.VISIBLE);
        button22.setVisibility(View.VISIBLE);
        button30.setVisibility(View.VISIBLE);
        button31.setVisibility(View.VISIBLE);
        button32.setVisibility(View.VISIBLE);

        tilesVisible = 12;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button00 = (Button) findViewById(R.id.imageButton00);
        final Button button01 = (Button) findViewById(R.id.imageButton01);
        final Button button02 = (Button) findViewById(R.id.imageButton02);

        final Button button10 = (Button) findViewById(R.id.imageButton10);
        final Button button11 = (Button) findViewById(R.id.imageButton11);
        final Button button12 = (Button) findViewById(R.id.imageButton12);

        final Button button20 = (Button) findViewById(R.id.imageButton20);
        final Button button21 = (Button) findViewById(R.id.imageButton21);
        final Button button22 = (Button) findViewById(R.id.imageButton22);

        final Button button30 = (Button) findViewById(R.id.imageButton30);
        final Button button31 = (Button) findViewById(R.id.imageButton31);
        final Button button32 = (Button) findViewById(R.id.imageButton32);

        final RelativeLayout background = (RelativeLayout) findViewById(R.id.background);

        background.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showTiles();
            }
        });

        button00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button21.setVisibility(View.INVISIBLE);
                button00.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button21.setVisibility(View.INVISIBLE);
                button00.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button01.setVisibility(View.INVISIBLE);
                button10.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button01.setVisibility(View.INVISIBLE);
                button10.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button02.setVisibility(View.INVISIBLE);
                button32.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button02.setVisibility(View.INVISIBLE);
                button32.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button11.setVisibility(View.INVISIBLE);
                button20.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button11.setVisibility(View.INVISIBLE);
                button20.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button12.setVisibility(View.INVISIBLE);
                button31.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button12.setVisibility(View.INVISIBLE);
                button31.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button22.setVisibility(View.INVISIBLE);
                button30.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button22.setVisibility(View.INVISIBLE);
                button30.setVisibility(View.INVISIBLE);

                tilesVisible = tilesVisible-2;
                checkTiles();
            }
        });
    }

    private void checkTiles() {
        if (tilesVisible == 0) {
            // Show the window

            new AlertDialog.Builder(this)
                    .setTitle("All tiles gone")
                    .setMessage("Yes you did it! You hide all the tiles!")
                    .setNeutralButton("Tell my friends...", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent myIntent = new Intent(MainActivity.this, ShareActivity.class);
                            startActivity(myIntent);
                            showTiles();
                        }
                    })
                    .setPositiveButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            showTiles();
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
