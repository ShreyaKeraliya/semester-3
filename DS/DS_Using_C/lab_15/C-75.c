#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NAME 100

struct Song {
    char name[MAX_NAME];
    struct Song* prev;
    struct Song* next;
};

struct Song* newSong(const char* name) {
    struct Song* song = (struct Song*)malloc(sizeof(struct Song));
    strncpy(song->name, name, MAX_NAME);
    song->prev = NULL;
    song->next = NULL;
    return song;
}

void addSong(struct Song** head, const char* name) {
    struct Song* song = newSong(name);
    if (*head == NULL) {
        *head = song;
        printf("Added \"%s\" as the first song in playlist.\n", name);
        return;
    }
    struct Song* curr = *head;
    while (curr->next) {
        curr = curr->next;
    }
    curr->next = song;
    song->prev = curr;
    printf("Added \"%s\" to playlist.\n", name);
}

void displayPlaylist(struct Song* head) {
    if (head == NULL) {
        printf("Playlist is empty.\n");
        return;
    }
    printf("Playlist:\n");
    struct Song* curr = head;
    int count = 1;
    while (curr) {
        printf("%d. %s\n", count++, curr->name);
        curr = curr->next;
    }
}

struct Song* deleteSong(struct Song** head, const char* name) {
    struct Song* curr = *head;

    while (curr != NULL) {
        if (strcmp(curr->name, name) == 0) {
            if (curr->prev) {
                curr->prev->next = curr->next;
            } else {
                *head = curr->next;  // deleting head
            }
            if (curr->next) {
                curr->next->prev = curr->prev;
            }
            printf("Deleted \"%s\" from playlist.\n", name);
            return curr;
        }
        curr = curr->next;
    }
    printf("Song \"%s\" not found in playlist.\n", name);
    return NULL;
}

int main() {
    struct Song* playlist = NULL;
    struct Song* currentSong = NULL;
    char choice;
    char name[MAX_NAME];

    printf("Simple Music Player Simulation\n");

    while (1) {
        printf("\nMenu:\n");
        printf("a: Add song\n");
        printf("p: Play next song\n");
        printf("r: Play previous song\n");
        printf("c: Show current song\n");
        printf("d: Display playlist\n");
        printf("x: Delete a song\n");
        printf("e: Exit\n");
        printf("Enter choice: ");
        scanf(" %c", &choice);

        switch (choice) {
            case 'a':
                printf("Enter song name to add: ");
                scanf(" %[^\n]", name);
                addSong(&playlist, name);
                if (currentSong == NULL) currentSong = playlist;  // Start from first song added
                break;

            case 'p':
                if (currentSong == NULL) {
                    printf("Playlist empty.\n");
                } else if (currentSong->next == NULL) {
                    printf("You are at the last song.\n");
                } else {
                    currentSong = currentSong->next;
                    printf("Playing next song: %s\n", currentSong->name);
                }
                break;

            case 'r':
                if (currentSong == NULL) {
                    printf("Playlist empty.\n");
                } else if (currentSong->prev == NULL) {
                    printf("You are at the first song.\n");
                } else {
                    currentSong = currentSong->prev;
                    printf("Playing previous song: %s\n", currentSong->name);
                }
                break;

            case 'c':
                if (currentSong == NULL) {
                    printf("No song is currently playing.\n");
                } else {
                    printf("Currently playing: %s\n", currentSong->name);
                }
                break;

            case 'd':
                displayPlaylist(playlist);
                break;

            case 'x':
                printf("Enter song name to delete: ");
                scanf(" %[^\n]", name);
                {
                    struct Song* deleted = deleteSong(&playlist, name);
                    if (deleted != NULL) {
                        // Adjust currentSong if necessary
                        if (currentSong == deleted) {
                            if (deleted->next) {
                                currentSong = deleted->next;
                            } else if (deleted->prev) {
                                currentSong = deleted->prev;
                            } else {
                                currentSong = NULL;
                            }
                        }
                        free(deleted);
                    }
                }
                break;

            case 'e':
                // Free all songs
                while (playlist != NULL) {
                    struct Song* temp = playlist;
                    playlist = playlist->next;
                    free(temp);
                }
                printf("Exiting music player.\n");
                return 0;

            default:
                printf("Invalid choice.\n");
        }
    }
}
