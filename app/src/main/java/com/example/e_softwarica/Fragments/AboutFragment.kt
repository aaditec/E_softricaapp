package com.example.e_softwarica.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_softwarica.R
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient


class AboutFragment : Fragment() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        webView = view.findViewById(R.id.webView)
        webView.getSettings().setJavaScriptEnabled(true)
        webView.getSettings().setLoadWithOverviewMode(true)
        webView.getSettings().setUseWideViewPort(true)
        webView.setWebViewClient(WebViewClient())
        webView.loadUrl("https://www.softwarica.edu.np")
        return view
    }

    companion object {

            }
    }
