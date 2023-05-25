// Ignore Spelling: Kmap

using System;
using System.ComponentModel;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace LogiCraft.Views
{
    public partial class AboutPage : ContentPage
    {
        public AboutPage()
        {
            InitializeComponent();

        }

        private async void TruthButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new TruthTable());
        }

        private async void KmapButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new Kmap());
        }

        private async void Boolean_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new BooleanExpressions());
        }
    }
}